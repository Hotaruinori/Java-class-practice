
#include <stdio.h>

int main(int argc, char* argv[])
{   
    int n;  //�j�鱱���ܼ� 
    
    printf("�ѼƭӼ�: %d\n",argc);    
    for( n=0; n<argc; n++ )
    {
    	printf("argv[%d] = %s\n",n,argv[n]);
    }
 
	//system("pause");
    return 0;
}
