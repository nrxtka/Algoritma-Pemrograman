#include <iostream>
using namespace std;

int main() {
    int a, b;
    cout << "Masukkan angka pertama: ";
     cin >> a;
     cout << "Masukkan angka kedua : ";
     cin >> b;

     if (a>b)
     cout << a<< "lebih v+besar dari" << b << endl;
     else if (a<b)
     cout << a<< "lebih kecil dari" << b<<endl;
else 
cout << "Keduanya sama besar" << endl;

cout << "Apakah keduanya sama >" << (a==b);
}