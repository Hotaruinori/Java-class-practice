
#include <stdio.h>

int main(int argc, char* argv[])
{   
    int n;  //癹伴北跑计 
    
    printf("把计计: %d\n",argc);    
    for( n=0; n<argc; n++ )
    {
    	printf("argv[%d] = %s\n",n,argv[n]);
    }
 
	//system("pause");
    return 0;
}
