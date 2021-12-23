package practice;

import java.util.ArrayList;
import java.util.Collections;

class Data{
    int start;
    int dur;
    int vol;

    Data(int s, int d, int v){
        this.start=s;
        this.dur = d;
        this.vol = v;
    }
}

public class Test1 {

    public static void main(String[] args) {

        int start[] = {10,5,15,18,30};
        int dur[] = {30,12,20,35,35};
        int vol[] ={50,51,20,25,10};

        System.out.println(findmaxProfit(start,dur,vol));

    }

    public static int findmaxProfit(int[] start, int[] dur, int[] vol){

        ArrayList<Data> al = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            Data d = new Data(start[i],dur[i],vol[i]);
            al.add(d);
        }


        Collections.sort(al, (o1, o2) -> o1.start - o2.start);

        return findProfit(al,0,0,0);


//        for (int i = 0; i < al.size(); i++) {
//            Data d1 = al.get(i);
//            System.out.print(d1.start+" "+d1.dur+" "+d1.vol);
//            System.out.println();
//        }
    }

    public static int findProfit(ArrayList<Data> list , int index, int profit, int maxDur){

        if(index == list.size())
            return profit;

        if(list.get(index).start > maxDur){
            profit = Integer.max(findProfit(list,index+1,profit,maxDur),
                    findProfit(list,index+1,list.get(index).vol+profit,
                            list.get(index).start+list.get(index).dur));
        }

        return profit;
    }
}
