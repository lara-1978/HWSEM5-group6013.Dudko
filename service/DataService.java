package service;

import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

public class DataService {
    private List<User> userList = new ArrayList<>();
    public void create(String firstName, String secondName, String lastName, Type type){
        int id= getFreeId(type);
        if(type == Type.STUDENT){
            userList.add(new Student(firstName, secondName, lastName, id));
        }
        if (type == Type.TEACHER){
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }
    }

    private int getFreeId(Type type){
        boolean itsStudent = Type.STUDENT == type;
        int lastId=1;
        for(User user: userList){
            if(user instanceof Teacher && !itsStudent)
                lastId=((Teacher)user).getTeacherId()+1;
            if(user instanceof Student && itsStudent)
                lastId =((Student)user).getStudentId()+1;
        }
        return lastId;
    }
    public List<User> getAllStudent(){
        List<User> result = new ArrayList<>(); //создадим новый список со стдуентами
        for (User user:userList){//перебераем список который был съагрегирован в dataservice
            if(user instanceof Student)
                result.add(user);
        }
        return result;  // теперь dataservice может возвращать всех наших студентов
    }


    public List<User> getAllTeacher(){
        List<User> result = new ArrayList<>(); //создадим новый список с учителями
        for (User user:userList){//перебераем список который был съагрегирован в dataservice
            if(user instanceof Teacher)
                result.add(user);
        }
        return result;
    }
}
