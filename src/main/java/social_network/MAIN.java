package social_network;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAIN {
    public static void main(String[] args) {

        person p1=new person("ayse",19,gender.FEMALE);
        person p2=new person("adil",23,gender.MALE);
        person p3=new person("mala",98,gender.MALE);
        person p4=new person("aynur",34,gender.FEMALE);
        person p5=new person("alide",20,gender.FEMALE);
        List<person>members= Arrays.asList(p1,p2,p3,p4,p5);



        memberTest memberTest= p->p.getGender().equals(gender.FEMALE)&&p.getAge()<25&&p.getAge()>18;
        print(members,memberTest);




    }
    public static void print(List<person> members, memberTest filter){
        List<person>RESULT=new ArrayList<>();

        for (person member : members) {
          if (filter.test(member)) {
              RESULT.add(member);
          }
        }
        System.out.println(RESULT);    }
}
