//1.Write a program to print the multiplication table of a number upto 10. 

#include <iostream>

using namespace std;

int main(){
	int n;
	cin>>n;
	for(int i = 0; i <=10; ++i)
		cout<<n<<" x "<<i<<" = "<<n*i<<endl;
	return 0;
}
