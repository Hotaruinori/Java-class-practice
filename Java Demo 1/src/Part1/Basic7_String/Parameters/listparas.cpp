
#include <stdio.h>

int main(int argc, char *argv[])
{   
    printf("參數個數: %d\n",argc);
    
    for(int n=0; n<argc; n++)
    {
       printf("argv[%d] = %s\n",n,argv[n]);
    }
 
    //system("pause");
    return 0;
}
