import java.util.*;
interface AccessControl{
    String getRole();
    int getAccessLevel();
    boolean canAccess(int requiredLevel);
}
class Developer implements AccessControl{
    String role;
    int accessLevel;
    Developer(String role, int accessLevel){
        this.role = role;
        this.accessLevel = accessLevel;
    }
    @Override 
    public String getRole(){
        return role;
    }
    public int getAccessLevel(){
        return accessLevel;
    }
    public boolean canAccess(int requiredLevel){
        return accessLevel >= requiredLevel;
    }
}
class Manager implements AccessControl{
    String role;
    int accessLevel;
    Manager(String role, int accessLevel){
        this.role = role;
        this.accessLevel = accessLevel;
    }
    @Override 
    public String getRole(){
        return role;
    }
    public int getAccessLevel(){
        return accessLevel;
    }
    public boolean canAccess(int requiredLevel){
        return accessLevel >= requiredLevel;
    }
}
class Administrator implements AccessControl{
    String role;
    int accessLevel;
    Administrator(String role, int accessLevel){
        this.role = role;
        this.accessLevel = accessLevel;
    }
    @Override 
    public String getRole(){
        return role;
    }
    public int getAccessLevel(){
        return accessLevel;
    }
    public boolean canAccess(int requiredLevel){
        return accessLevel >= requiredLevel;
    }
}
public class EmployeeAccessAndPermissionSystem {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int roleType = sc.nextInt();
        int requiredLevel = sc.nextInt();
        AccessControl employee;
        if(roleType==1){
            employee = new Developer("Developer",1);
            System.out.println("Role: "+employee.getRole());
            System.out.println("AccessLevel: "+ employee.getAccessLevel());
            System.out.println("Can Access: "+employee.canAccess(requiredLevel));
        }
        else if(roleType==2){
            employee = new Manager("Manager",2);
            System.out.println("Role: "+employee.getRole());
            System.out.println("AccessLevel: "+ employee.getAccessLevel());
            System.out.println("Can Access: "+employee.canAccess(requiredLevel));
        }
        else{
            employee = new Administrator("Administrator",3);
            System.out.println("Role: "+employee.getRole());
            System.out.println("AccessLevel: "+ employee.getAccessLevel());
            System.out.println("Can Access: "+employee.canAccess(requiredLevel));
        }
    }
}
