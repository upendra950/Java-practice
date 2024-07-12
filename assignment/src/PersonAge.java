import java.util.*;
class Person implements Comparable<Person>{

    int age;
    String name;
    public Person(int age,String name){
        this.name=name;
        this.age=age;

    }
    public String  toString(){
        return "name : "+this.name+" age : "+this.age;
    }
    public int compareTo(Person o){
        if(this.name.length()>o.name.length()){
            return 1;
        }
        else{return -1;}

    }

}

class PersonAge{
    public static void main(String[] args) {
        //Comparator<Person> lis=(i,j)->(i.age > j.age)?1:-1;
        List<Person> p=new ArrayList<>();
        p.add(new Person(24,"venkat"));
        p.add(new Person(21,"premKumar"));
        p.add(new Person(22,"upendra"));
        p.add(new Person(23,"kamesh"));
       // Collections.sort(p,(i,j)->(i.age > j.age)?1:-1);
Collections.sort(p);
        for(Person pr:p){
            System.out.println(pr);
        }

    }
}
