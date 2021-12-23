package practice;

import java.util.*;

class Relation{
    String child;
    String parent1;
    String parent2;

    Relation(){}
    Relation(String child,String parent1, String parent2){
        this.child=child;
        this.parent1=parent1;
        this.parent2 = parent2;
    }
}
// you have to find the heir for a throne given the relations and the person claiming them
// that person will become who has more blood from founder which keeps decreasing by 1/2 as new generation comes
public class HeirOfThrone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();
        String founder = sc.nextLine();
        ArrayList<Relation> relations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Relation relation = new Relation();
            relation.child = sc.next();
            relation.parent1 = sc.next();
            relation.parent2 = sc.next();
            relations.add(relation);
        }
        relations.add(0,new Relation(founder,null,null));
        sc.nextLine();
        String[] claimants = new String[m];
        for (int i = 0; i < m; i++) {
            claimants[i] = sc.nextLine();
        }

        System.out.println("maxblood "+findHeir(n,m,founder,relations,claimants));

    }

    public static String findHeir(int n, int m, String founder, List<Relation> relations, String[] claimants){

        Map<String,List<String>> royalFamilyRelations = new HashMap<>();

        for (int i = 0; i < relations.size(); i++) {

            String from  = relations.get(i).child;
            List<String>  to = new ArrayList<>();
            for (int j = 1; j< relations.size(); j++) {
                if(i!=j && relations.get(j).parent1.equals(from) || relations.get(j).parent2.equals(from)){
                    to.add(relations.get(j).child);
                }
            }
            royalFamilyRelations.put(from , to);
        }

        System.out.println(royalFamilyRelations);

        HashMap<String,Double> bloodLevel  = new HashMap<>();
        bloodLevel.put(founder,1.0);
        Queue<String> queue = new LinkedList<>();
        queue.add(founder);
        while(!queue.isEmpty()){

            String start = queue.poll();
            List<String> child = royalFamilyRelations.get(start);
            for (int i = 0; i < child.size(); i++) {

                if(!queue.contains(child.get(i))){
                    queue.add(child.get(i));
                }

                if(bloodLevel.containsKey(child.get(i))){
                    double currBlood = bloodLevel.get(child.get(i));
                    currBlood+=0.5*(bloodLevel.get(start)); //half the blood of ancestor
                    bloodLevel.put(child.get(i),currBlood);
                } else {
                    bloodLevel.put(child.get(i),(bloodLevel.get(start)*0.5));
                }
            }
        }

        System.out.println(bloodLevel);
        double maxBlood = Double.MIN_VALUE;
        String result = "";
        for (int i = 0; i < claimants.length; i++) {

            if(!claimants[i].equals(founder)) {
                if (bloodLevel.containsKey(claimants[i]) && bloodLevel.get(claimants[i]) > maxBlood) {
                    maxBlood = bloodLevel.get(claimants[i]);
                    result = claimants[i];
                }
            }
        }

        return result;

    }
}
