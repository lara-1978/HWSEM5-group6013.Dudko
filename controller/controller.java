import java.util.List;

import model.Student;
import model.StudentGroup;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.GroupService;
import view.StudentView;
import view.TeacherView;

public  class controller {
    

    private final StudentView studentView = new StudentView();
    private final DataService dataService = new DataService();
    private final TeacherView teacherView = new TeacherView();
    private final GroupService groupService = new GroupService();

    
    public void  createStudent(String firstName, String secondName, String lastName,  int  studentId) { // создаем нового студента и добавляем его в список
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
        
    }
    public void getAllStudent(){
        List<User> userList = dataService.getAllStudent();
        for(User user : userList)
            studentView.printOnConsole(user);

    }
    public void  createTeacher(String firstName, String secondName, String lastName) {  //создаем новоо учителя и добавляем в список
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
        
    }
    public void getAllTeacher() {
        List<User> userList = dataService.getAllTeacher();
        for (User user :userList)
            teacherView.printOnConsole( user);
        }

        public StudentGroup createGroup(Integer numberGroup, Teacher teacher, Student... students) {
            return groupService.CreateGroup(numberGroup, teacher, students);
        }
    
        public void printStudents(Student student) {
            studentView.printOnConsole(student);
        }

    
}