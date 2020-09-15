//Solution in C++




#include<iostream>

using namespace std;

void hailStone(int num);

int main(void)
{
	int num = 0;
	cout<<"Enter an integer that is greater than 1: ";
	cin>>num;
	
	hailStone(num);
}



void hailStone(int num)
{
	cout<<num<<", ";
	
	while(num>1)
	{
		if(num%2==0)
		{
			num/=2;
		}
		
		else
		{
			num*=3;
			num++;
		}
		cout<<num<<", ";
	}
	cout<<"END";
}
