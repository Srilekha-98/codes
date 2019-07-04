import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int b=Integer.parseInt(br.readLine());
if(b==0)
System.out.println("Zero");
else if(b>0)
System.out.println("Positive");
else
System.out.println("Negative");
}
}

