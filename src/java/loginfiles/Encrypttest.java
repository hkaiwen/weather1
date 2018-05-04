/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginfiles;



/**
 *
 * @author Jared
 */
public class Encrypttest {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    public static String encrypt(String input){
        String Newstr = "";
        
        for (int i=0;i<input.length();i++){
            char ch=(input.charAt(i));
            switch (ch){
                case 'a':
                    Newstr=Newstr+"{";
                    break;
                case 'b':
                    Newstr=Newstr+"}";
                    break;
                case 'c':
                    Newstr=Newstr+"#";
                    break;
                case 'd':
                    Newstr=Newstr+"~";
                    break;
                case 'e':
                    Newstr=Newstr+"+";
                    break;
                case 'f':
                    Newstr=Newstr+"-";
                    break;
                case 'g':
                    Newstr=Newstr+"*";
                    break;
                case 'h':
                    Newstr=Newstr+"@";
                    break;
                case 'i':
                    Newstr=Newstr+"/";
                    break;
                case 'j':
                    Newstr=Newstr+"\\";
                    break;
                case 'k':
                    Newstr=Newstr+"?";
                    break;
                case 'l':
                    Newstr=Newstr+"$";
                    break;
                case 'm':
                    Newstr=Newstr+"!";
                    break;
                case 'n':
                    Newstr=Newstr+"^";
                    break;
                case 'o':
                    Newstr=Newstr+"(";
                    break;
                case 'p':
                    Newstr=Newstr+")";
                    break;
                case 'q':
                    Newstr=Newstr+"<";
                    break;
                case 'r':
                    Newstr=Newstr+">";
                    break;
                case 's' :
                    Newstr=Newstr+"=";
                    break;
                case 't':
                    Newstr=Newstr+";";
                    break;
                case 'u':
                    Newstr=Newstr+",";
                    break;
                case 'v' :
                    Newstr=Newstr+"_";
                    break;
                case 'w':
                    Newstr=Newstr+"[";
                    break;
                case 'x' :
                    Newstr=Newstr+"]";
                    break;
                case 'y':
                    Newstr=Newstr+":";
                    break;
                case 'z' :
                    Newstr=Newstr+"\"";
                    break;
                case 'A':
                    Newstr=Newstr+"O";
                    break;
                case 'B':
                    Newstr=Newstr+"N";
                    break;
                case 'C':
                    Newstr=Newstr+"`";
                    break;
                case 'D':
                    Newstr=Newstr+"M";
                    break;
                case 'E':
                    Newstr=Newstr+"P";
                    break;
                case 'F':
                    Newstr=Newstr+"L";
                    break;
                case 'G':
                    Newstr=Newstr+"Q";
                    break;
                case 'H':
                    Newstr=Newstr+"K";
                    break;
                case 'I':
                    Newstr=Newstr+"R";
                    break;
                case 'J':
                    Newstr=Newstr+"J";
                    break;
                case 'K':
                    Newstr=Newstr+"S";
                    break;
                case 'L':
                    Newstr=Newstr+"I";
                    break;
                case 'M':
                    Newstr=Newstr+"T";
                    break;
                case 'N':
                    Newstr=Newstr+"H";
                    break;
                case 'O':
                    Newstr=Newstr+"U";
                    break;
                case 'P':
                    Newstr=Newstr+"G";
                    break;
                case 'Q':
                    Newstr=Newstr+"V";
                    break;
                case 'R':
                    Newstr=Newstr+"F";
                    break;
                case 'S' :
                    Newstr=Newstr+"W";
                    break;
                case 'T':
                    Newstr=Newstr+"E";
                    break;
                case 'U':
                    Newstr=Newstr+"X";
                    break;
                case 'V' :
                    Newstr=Newstr+"D";
                    break;
                case 'W':
                    Newstr=Newstr+"Y";
                    break;
                case 'X' :
                    Newstr=Newstr+"B";
                    break;
                case 'Y':
                    Newstr=Newstr+"Z";
                    break;
                case 'Z' :
                    Newstr=Newstr+"A";
                    break;
                case ' ' :
                    Newstr=Newstr+" ";
                    break;
                case '.':
                    Newstr=Newstr+'3';
                    break;
                case ',':
                    Newstr=Newstr+"1";
                    break;
                case '(':
                    Newstr=Newstr+'4';
                    break;
                case '\"':
                    Newstr=Newstr+'5';
                    break;
                case ')' :
                    Newstr=Newstr+"7";
                    break;
                case '?' :
                    Newstr= Newstr+"2";
                    break;
                case '!':
                    Newstr= Newstr+"8";
                    break;
                case '-' :
                    Newstr= Newstr+"6";
                    break;
                case '%' :
                    Newstr = Newstr+"9";
                    break;
                case '1':
                    Newstr=Newstr+"|0";
                    break;
                case '2':
                    Newstr=Newstr+"|9";
                    break;
                case '3':
                    Newstr=Newstr+"|-";
                    break;
                case '4':
                    Newstr = Newstr+"|8";
                    break;
                case '5':
                    Newstr = Newstr+"|2";
                    break;
                case '6':
                    Newstr = Newstr+"|7";
                    break;
                case '7':
                    Newstr = Newstr+"|3";
                    break;
                case '8' :
                    Newstr= Newstr+"|6";
                    break;
                case '9':
                    Newstr = Newstr+"|4";
                    break;
                case '0':
                    Newstr = Newstr+"|5";
                    break;
                default:
                    Newstr=Newstr+"0";
                    break;
             }
        }
        return Newstr;
    }
    
      
    
    public static String decrypt(String input){
        String Newstr = "";
	for (int i=0;i<input.length();i++){
            char ch=(input.charAt(i));
            switch (ch){
                case '{':
                    Newstr=Newstr+"a";
                    break;
                case '}':
                    Newstr=Newstr+"b";
                    break;
                case '#':
                    Newstr=Newstr+"c";
                    break;
                case '~':
                    Newstr=Newstr+"d";
                    break;
                case '+':
                    Newstr=Newstr+"e";
                    break;
                case '-':
                    Newstr=Newstr+"f";
                    break;
                case '*':
                    Newstr=Newstr+"g";
                    break;
                case '@':
                    Newstr=Newstr+"h";
                    break;
                case '/':
                    Newstr=Newstr+"i";
                    break;
                case '\\':
                    Newstr=Newstr+"j";
                    break;
                case '?':
                    Newstr=Newstr+"k";
                    break;
                case '$':
                    Newstr=Newstr+"l";
                    break;
                case '!':
                    Newstr=Newstr+"m";
                    break;
                case '^':
                    Newstr=Newstr+"n";
                    break;
                case '(':
                    Newstr=Newstr+"o";
                    break;
                case ')':
                    Newstr=Newstr+"p";
                    break;
                case '<':
                    Newstr=Newstr+"q";
                    break;
                case '>':
                    Newstr=Newstr+"r";
                    break;
                case '=' :
                    Newstr=Newstr+"s";
                    break;
                case ';':
                    Newstr=Newstr+"t";
                    break;
                case ',':
                    Newstr=Newstr+"u";
                    break;
                case '_' :
                    Newstr=Newstr+"v";
                    break;
                case '[':
                    Newstr=Newstr+"w";
                    break;
                case ']' :
                    Newstr=Newstr+"x";
                    break;
                case ':':
                    Newstr=Newstr+"y";
                    break;
                case '\"' :
                    Newstr=Newstr+"z";
                    break;
                case '1':
                    Newstr=Newstr+",";
                    break;
                case '2':
                    Newstr=Newstr+"?";
                    break;
                case '3':
                    Newstr=Newstr+".";
                    break;
                case '4':
                    Newstr = Newstr+"(";
                    break;
                case '5':
                    Newstr = Newstr+"\\";
                    break;
                case '6':
                    Newstr = Newstr+"-";
                    break;
                case '7':
                    Newstr = Newstr+")";
                    break;
                case '8' :
                    Newstr= Newstr+"!";
                    break;
                case '9':
                    Newstr = Newstr+"%";
                    break;
                case '.':
                    Newstr = Newstr+" ";
                    break;
                case 'O':
                    Newstr=Newstr+"A";
                    break;
                case 'N':
                    Newstr=Newstr+"B";
                    break;
                case '`':
                    Newstr=Newstr+"C";
                    break;
                case 'M':
                    Newstr=Newstr+"D";
                    break;
                case 'P':
                    Newstr=Newstr+"E";
                    break;
                case 'L':
                    Newstr=Newstr+"F";
                    break;
                case 'Q':
                    Newstr=Newstr+"G";
                    break;
                case 'K':
                    Newstr=Newstr+"H";
                    break;
                case 'R':
                    Newstr=Newstr+"I";
                    break;
                case 'J':
                    Newstr=Newstr+"J";
                    break;
                case 'S':
                    Newstr=Newstr+"K";
                    break;
                case 'I':
                    Newstr=Newstr+"L";
                    break;
                case 'T':
                    Newstr=Newstr+"M";
                    break;
                case 'H':
                    Newstr=Newstr+"N";
                    break;
                case 'U':
                    Newstr=Newstr+"O";
                    break;
                case 'G':
                    Newstr=Newstr+"P";
                    break;
                case 'V':
                    Newstr=Newstr+"Q";
                    break;
                case 'F':
                    Newstr=Newstr+"R";
                    break;
                case 'W' :
                    Newstr=Newstr+"S";
                    break;
                case 'E':
                    Newstr=Newstr+"T";
                    break;
                case 'X':
                    Newstr=Newstr+"U";
                    break;
                case 'D' :
                    Newstr=Newstr+"V";
                    break;
                case 'Y':
                    Newstr=Newstr+"W";
                    break;
                case 'B' :
                    Newstr=Newstr+"X";
                    break;
                case 'Z':
                    Newstr=Newstr+"Y";
                    break;
                case 'A' :
                    Newstr=Newstr+"Z";
                    break;
                case '|':
                    switch(input.charAt(i+1)){
                        case '0':
                            Newstr=Newstr+"1";
                            i++;
                            break;
                        case '9':
                            Newstr=Newstr+"2";
                            i++;
                            break;
                        case '-':
                            Newstr=Newstr+"3";
                            i++;
                            break;
                        case '8':
                            Newstr = Newstr+"4";
                            i++;
                            break;
                        case '2':
                            Newstr = Newstr+"5";
                            i++;
                            break;
                        case '7':
                            Newstr = Newstr+"6";
                            i++;
                            break;
                        case '3':
                            Newstr = Newstr+"7";
                            i++;
                            break;
                        case '6' :
                            Newstr= Newstr+"8";
                            i++;
                            break;
                        case '4':
                            Newstr = Newstr+"9";
                            i++;
                            break;
                        case '5':
                            Newstr = Newstr+"0";
                            i++;
                            break;
                        default:
                            Newstr = Newstr+"0";
                        }
                        break;
                default:
                    Newstr=Newstr+"0";
                    break;
                }
            }
        return Newstr;           
    }   
}
