
#include <iostream>                          
#include <cstdlib>

using namespace std;

int main()
{
	enum drink    //定義drink 列舉型態                                
	{
		coffee=25,
		milk=20,
		tea,
		water
	};
	 
    drink dnk; 

	dnk=coffee;
	cout << "列舉型態的 coffee 值=" << dnk << endl ;

	dnk=milk;
	cout << "列舉型態的 milk 值=" << dnk << endl;
	 
	dnk=tea;
	cout << "列舉型態的 tea 值=" << dnk << endl;	 

	dnk=water;
	cout << "列舉型態的 water 值=" << dnk << endl;
     
    //system("pause");
    return 0;
}