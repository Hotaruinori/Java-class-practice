
#include <iostream>                          
#include <cstdlib>

using namespace std;

int main()
{
    
    enum drink  //�w�qdrink �C�|���A                                
	{
		coffee,
		milk,
		tea,
		water
	};
	 
     drink dnk; 

	dnk=coffee;
	cout << "�C�|���A�� coffee ��=" << dnk << endl ;

	dnk=milk;
	cout << "�C�|���A�� milk ��=" << dnk << endl;
	 
	dnk=tea;
	cout << "�C�|���A�� tea ��=" << dnk << endl;	 

	dnk=water;
	cout << "�C�|���A�� water ��=" << dnk << endl;
     
    //system("pause");
    return 0;
}