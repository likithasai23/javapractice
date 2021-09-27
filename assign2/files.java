import java.io.File;

import java.io.FileFilter;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.FilenameFilter;

import java.io.IOException;

import java.util.Scanner;

public class files {

public static void main(String[] args) throws FileNotFoundException, IOException 

{

String path = "../";

 

 

 // Create a constructor of the files directories 

files f= new files();

f.createReadOnlyFile(path+"trash");
String s = f.readFile(new File("../trash"));
System.out.println(s);
f.createTextFile(path+"likitha");
System.out.println(f.readFile(new File("../likitha.txt")));
 File fi=new File("../likitha.txt");
f.writeIntoFile(fi);
f.readFile(fi);
f.deleteTexFile(path+"likitha.txt");

}

 

 


private void deleteTexFile(String path) {

File file = new File(path);

if(file.isDirectory()) {

for(File f : file.listFiles(new FilenameFilter() {

 

 @Override

public boolean accept(File dir, String name) {

return name.endsWith(".tex");

}

}) ) {

f.delete();

 System.out.println("your file has been deleted!");

}


}

}

private void createTextFile(String string) throws FileNotFoundException, IOException {


String extention;
File f= new File(string+".txt");
if(f.exists()) f.delete();
this.writeIntoFile(f);
}

private String readFile(File file) throws IOException, FileNotFoundException {
FileInputStream fi = new FileInputStream(file.toString());
byte[] b = (byte[]) fi.readAllBytes();
fi.close();
return new String(b);

}

public void writeIntoFile(File file) throws FileNotFoundException,IOException {

FileOutputStream fo= new FileOutputStream(file.toString(), true);

Scanner sc = new Scanner(System.in);

 System.out.println("Enter the Contents of the file:: "+file.getName());
String s = sc.nextLine()+"\n";
byte[] buffer = s.getBytes();
fo.write(buffer);
fo.close();

 

}

public void createReadOnlyFile(String filename) throws IOException, FileNotFoundException 

{

File file = new File(filename);
if(file.exists()) file.delete();
this.writeIntoFile(file);
file.setReadOnly();
 System.out.println("File Created and converted to Read Only");

}

 


 

}