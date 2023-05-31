
public class CountSeconds {

public static void main(String[] args)
{

float time = 0;
for (int h=0; h<24; h++)
{
for (int m=0; m<60; m++)
{
for (int s=0; s<60; s++) 
{
time+=1;
}
}
}
System.out.println((int)time);
}
}
