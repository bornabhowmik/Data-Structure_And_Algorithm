#include <stdio.h>

int main() {
    char a = '5';
    int b = 9;

    int result = a + b;
    printf("Addition with Character and Integer is = %d\n", result);


    double x = 5.67;
    int y= 9;

    double output = (int)x + y;
    printf("Output with Explicit type conversion is = %lf\n", output);

    return 0;
}
