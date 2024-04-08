public class Main {
    
public static void main(String[] args) {
    controller controller = new controller();
    controller.createStudent("Иван", "Иванович", "Иванов",1);
    controller.createStudent("Алексей", "Николаевич", "Петров", 2);
    controller.createStudent("Олег", "Сергеевич", "Вязович",3);
    
    
    
    controller.getAllStudent();
    System.out.println();


    controller.createTeacher("Анна", "Сергеевна", "Иванова");
    controller.createTeacher("Максим", "Иванович", "Максимов");
    

    controller.getAllTeacher();
    System.out.println();

    // controller.createGroup(1, "Иванова", "Иванов");
        






    }
}

