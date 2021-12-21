package Odevler;

// Burç bulan program

import java.util.Scanner;

/**
 * @author Osman Kurun - 16.12.2021
 */

public class odev13 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int gun,ay;
        String burc = "";

        System.out.print("Kaçıncı ayda doğduunz: ");
        ay = inp.nextInt();
        System.out.print("Kaçıncı günde doğdunuz: ");
        gun = inp.nextInt();
        boolean hata = false;

        if (ay==1){
            if (gun>=1&&gun<=31){
             if (gun<=21){
                 burc = "Oğlak";
             }else {
                 burc = "Kova";
             }
            }else {
                hata = true;
            }
        }else if(ay==2) {
            if (gun >= 1 && gun <= 28) {
                if (gun <= 19) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                hata = true;
            }
        }else if(ay==3) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 20) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                hata = true;
            }
        }else if(ay==4) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 20) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                hata = true;
            }
        }else if(ay==5) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                hata = true;
            }
        }else if(ay==6) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 22) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                hata = true;
            }
        }else if(ay==7) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                hata = true;
            }
        }else if(ay==8) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 22) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                hata = true;
            }
        }else if(ay==9) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 22) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                hata = true;
            }
        }else if(ay==10) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                hata = true;
            }
        }else if(ay==11) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                hata = true;
            }
        }else {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                hata = true;
            }
        }
        if (hata){
            System.out.print("Geçersiz değer girdiniz. Lütfen kontrol ediniz.");
        }else {
            System.out.print("Burcunuz : " + burc + " burcu.");
        }

    }

}
