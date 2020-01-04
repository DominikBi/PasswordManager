package main;



import java.io.*;

public class PasswordFile {
    private File file;

    PasswordFile(){
        file = new File("C:\\Users\\birke\\IdeaProjects\\FacebookProfile\\data\\Pwd\\Zb.txt");

    }
    public void write(Pack pack){
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            dataOutputStream.writeUTF(pack.name);
            dataOutputStream.writeUTF(pack.password);
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void read(){

    }
}
