#include <iostream>
#include <string>
using namespace std;

int main()
{
    string nama;
    string valid;
    int nim;
    int pilihan;
    float jumlah;
    string tujuan;

    cout << "Silahkan Masukkan Nama Anda: ";
    cin >> nama;

    cout << "Apakah Nama sudah benar? (ya/tidak): ";
    cin >> valid;

   if (valid == "ya" || valid == "Ya" || valid == "YA") {

        cout << "Silahkan Masukkan NIM Anda: ";
        cin >> nim;

                cout << "\n===== DATA ANDA =====\n";
        cout << "Nama  : " << nama << endl;
        cout << "Saldo : Rp " << nim << endl;
		
		cout << "\n===== MENU ATM =====\n";
        cout << "1. Cek Saldo\n";
        cout << "2. Tarik Tunai\n";
       	cout << "3. Setor Tunai\n";
        cout << "4. Transfer\n";
        cout << "5. Keluar\n";
        cout << "Pilih Menu (1-5): ";
        cin >> pilihan;
        
        switch (pilihan) {
        case 1:
                cout << "\nSaldo Anda: Rp " << nim << endl;
                break;
        
        case 2:
        	cout << "\nMasukkan jumlah penarikan Rp \n";
        	cin >> jumlah;
        	
        	if (jumlah > nim) {
        		cout << "Saldo anda tidak cukup\n";
			}else {
				nim -= jumlah;
				cout << "Penarikan berhasil.\n";
				cout << "Sisa Saldo: Rp." <<nim <<endl;
			} break;
			
		case 3:
			cout << "\nMasukkan jumlah setoran Rp \n";
			cin >> jumlah;
			
			nim += jumlah;
			cout << "Sisa Saldo: Rp." << nim << endl;
			break;
			
		case 4:
			cout << "\nMasukkan nama penerima transfer:";
			cin >> tujuan;
			
			cout << "\nMasukkan jumlah transfer: Rp.";
			cin >> jumlah;
			
				if (jumlah > nim) {
        		cout << "Saldo anda tidak cukup\n";
			}else {
				nim -= jumlah;
				cout << "Transfer berhasil.\n";
				cout << "Sisa Saldo: Rp." <<nim <<endl;
			} break;
			
		case 5:
			cout << "Anda Keluar, Terimakasih!";
			break;
		}

    } else {
    cout << "Nama salah, silahkan ulangi" << endl;
    return 0;
}


}
