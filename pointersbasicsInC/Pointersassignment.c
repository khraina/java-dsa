#include <stdio.h>

int main() {
    int a=10,b=5;
    int *p,*q;
    p=&a;
    q=&b;           //q must be initialized b4 using *q=*p
    
    printf("a=%d and b=%d",*p,*q);
    *q=*p;          //the value which is pointed by p is set as the value of q
    
    printf("\n the value of a is %d %d %d",a,*p,*q);
    return 0;
}

/*
Output
a=10 and b=5
the value of a is 10 10 10

*/