/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.io.*;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dark Magician
 */
public class Lab3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       
            FileInputStream fos= new FileInputStream("staffs.bin");
            ObjectInputStream bos = new ObjectInputStream(fos);
            Staff staffs[] = (Staff[]) bos.readObject();
            for(int i =0;i<staffs.length;i++)
            {    
                System.out.print(staffs[i].toString());
            }
            bos.close();
            fos.close();
      
            
            
            
//        try{
//        FileWriter fw = new FileWriter("staff.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
//        for(int i = 0;i<3;i++)
//        {
//            Staff st= new Staff();
//            st.input();
//            bw.write(st.toString());
//        }
//        bw.flush();
//        bw.close();
//        }catch(IOException ioe)
//        {
//            System.out.println("IOException "+ ioe);
//        }catch(Exception ex)
//        {
//            System.out.println("Exception "+ ex);
//        }
//          FileReader fd = null;
//          BufferedReader br= null;
//          try{
//          fd = new FileReader("staff.txt");
//          br = new BufferedReader(fd);
//          String text;
//          while((text = br.readLine())!=null)
//          {
//              System.out.println(text);
//          }
//          }catch(IOException ioex)
//          {
//              System.out.printf("FileNotFound"+ioex);
//          }catch(Exception ex)
//          {
//          
//          }finally{
//              try{
//              fd.close();
//              br.close();
//              }
//              catch(IOException ios)
//              {
//                  System.out.print("Co loi: "+ios);
//              }
//              catch(Exception ex)
//              {
//                  System.out.print("co loi: "+ex );
//              }
//          }
//            FileOutputStream fos = null;
//            ObjectOutputStream oos = null;
//            Staff staffs[]= new Staff[3];
//            try{
//                for(int i = 0;i<3;i++)
//                {
//                    staffs[i] = new Staff();
//                    staffs[i].input();
//                }
//                fos = new FileOutputStream("staffs.bin");
//                oos = new ObjectOutputStream(fos);
//                oos.writeObject(staffs);
//            }catch(NullPointerException ex)
//            {
//                System.out.println("co loi: "+ex);
//            }catch(IOException ex)
//            {
//                System.out.println("Khong tim thay file: "+ex);
//            }finally{
//                try{
//                    oos.flush();
//                    oos.close();
//                }catch(Exception ex)
//                {
//                    System.out.print("co loi o finally: "+ex);
//                }
//            }
//              FileInputStream fis= null;
//              ObjectInputStream is = null;
//              try{
//                    fis = new FileInputStream("staffs.bin");
//                    is = new ObjectInputStream(fis);
//                    Staff staffs[] =(Staff[]) is.readObject();  
//                    for(Staff s: staffs)
//                    {
//                        System.out.print(s);
//                    }
//              }catch(Exception ex){
//                  System.out.println("co loi: "+ex);
//              }finally
//              {
//                  try{
//                      
//                      is.close();
//                  }catch(IOException ex)
//                  {
//                      
//                  }
//              }
        
                      
                      
    }
    
}
