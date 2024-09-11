package company;

public class ObjectSample {

    public static void main(String[] args) {
        
        var salesDepartment = new Department("営業部", "xx", 1000000);
        var employee = new Employee("鈴木", department, "課長", 100);
        
        sales.report();
        sales.report(2);
        sales.joinMeeting();
        
        System.out.println("");
        
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", "devDepartment", "一般社員", 88, "Java");
        
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        
        System.out.println("");
        
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        
        
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            
            ((Engineer) projectManager).developSoftware();
        }
        
        
        System.out.println("");
        
        var parttimeWorker = new ParttimeWorker("太田", salesDepartment);
        
        
        ((Workable) employee).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();
    }

    
}
