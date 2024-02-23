package PBO;

public class User {
    
    private String username;
    private String password;
    private int id;
    private boolean status;

    public User(){
        System.out.println("CONSTRUCTOR");
    }

    public User(String a, String b){
        this.username = a;
        this.password = b;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        if (this.status = true){
            System.out.println("Status: Sudah menikah");
        } else if(this.status = false){
            System.out.println("Status: Belum menikah");
        }
    }
}
