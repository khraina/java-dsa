
#include <stdio.h>

int main() {
    
    int a=10,b=9;
    int *p,*q;
    p=&a;
    q=&b;
    int c=*p;
    
    
    printf("\nvalue of a is %d",a);
    printf("\nvalue of a is %d",*p);
    
    printf("\naddress of a is %x",p);
    printf("\naddress of a is %x",&a);
    
    printf("\naddress of P is %x",&p);
    
    printf("\nvalue of C is %d",c);
    
    q=(&a,&b);      //comma operator p gets the value of b
    printf("\naddress of Q is %x",q);
    printf("\naddress of B is %x",&b);
    printf("\naddress of A is %x",&a);

    return 0;
}

/*output
value of a is 10
value of a is 10
address of a is 8f58d080
address of a is 8f58d080
address of P is 8f58d070
value of C is 10
address of Q is 8f58d07c
address of B is 8f58d07c
address of A is 8f58d080
*/