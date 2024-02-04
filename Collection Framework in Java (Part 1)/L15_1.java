import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L15_1 {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList<>();
        List obj1= new ArrayList();
        obj.add("Apple");
        obj.add(100);
        obj.add('D');
        ArrayList<Integer> obj2=new ArrayList<Integer>();
        obj2.add(100);
        obj2.add(800);
        ArrayList<String> st=new ArrayList<String>();
        st.add("california");
        st.add("Alabama");
        st.add("Alaska");
        st.add("Arkansas");
        String s=st.get(2);
        System.out.println(s);
        System.out.println(st.size());
        for (int i=0;i<st.size();i++){
            System.out.println(st.get(i));
        }
        st.set(2,"Texas");
        System.out.println(st);
        String t=st.remove(3);
        System.out.println("States Removed is "+t);
        System.out.println("ArrayList after deletion "+st);
        st.sort(Comparator.naturalOrder());
        System.out.println("After sorting"+st);
        System.out.println("Texas is at "+st.indexOf("Texas")+" index");
        System.out.println("Is NewYork There ?"+st.contains("newyork"));
        System.out.println("Is List Em[pty?"+st.isEmpty());
        st.removeAll(st);
        System.out.println("Is list empty ?"+st.isEmpty());
    }
}
