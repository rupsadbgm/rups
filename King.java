class King {
int a=10;
static void mul(King k)
{
	int area=k.a*k.a;
	System.out.println(area);
}
public static void main(String[] args) {
King k=new King(); 
	mul(k);
}
}
