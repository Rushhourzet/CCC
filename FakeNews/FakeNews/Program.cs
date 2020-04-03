using System;
using System.IO;

namespace FakeNews {
    class Program {
        static void Main(string[] args) {
            Level1_1();
            Console.WriteLine("##############################################################################################");
            Console.WriteLine("##############################################################################################");
            Console.WriteLine("##############################################################################################");
            Network n2 = FileToNetwork(@"Z:\ccc\school_2020\level1_2.in");                                                     
            n2.Run();                                                                                                          
            Console.WriteLine("##############################################################################################");
            Console.WriteLine("##############################################################################################");
            Console.WriteLine("##############################################################################################");
                                                                                                                               
            Network n3 = FileToNetwork(@"Z:\ccc\school_2020\level1_3.in");                                                     
            n3.Run();
            Console.WriteLine("##############################################################################################");
            Console.WriteLine("##############################################################################################");
            Console.WriteLine("##############################################################################################");

            Network n4 = FileToNetwork(@"Z:\ccc\school_2020\level1_4.in");                                                     
            n4.Run();                                                                                                          
            Console.WriteLine("##############################################################################################");
            Console.WriteLine("##############################################################################################");
            Console.WriteLine("##############################################################################################");
                                                                                                                               
            Network n5 = FileToNetwork(@"Z:\ccc\school_2020\level1_5.in");                                                     
            n5.Run();                                                                                                          
            Console.WriteLine("##############################################################################################");
            Console.WriteLine("##############################################################################################");
            Console.WriteLine("##############################################################################################");

        }

        private static void Level1_1() {
            Network n = new Network(17);
            n.input = new Network.Input(
                27,
                new string[] {
                "Mn",
                "Ux",
                "Ms",
                "Qy",
                "Mv",
                "Eo",
                "Ap",
                "Xi",
                "Au",
                "Nc",
                "Xn",
                "Pl",
                "Nl",
                "Lk",
                "Ps",
                "Dn",
                "Ly",
                "Bq",
                "Jz",
                "Sc",
                "Uf",
                "Yl",
                "Sg",
                "Oh",
                "Qp",
                "Kj",
                "Gf",
                },
                48,
                new string[] {
                "Ux Bq",
                "Eo Bq",
                "Ux Xi",
                "Yl Nc",
                "Nc Mn",
                "Pl Qp",
                "Mn Pl",
                "Yl Bq",
                "Mn Kj",
                "Sg Kj",
                "Ap Mn",
                "Sc Jz",
                "Eo Uf",
                "Xi Kj",
                "Xi Bq",
                "Au Kj",
                "Dn Nl",
                "Xn Yl",
                "Ps Yl",
                "Mv Qy",
                "Sc Oh",
                "Yl Ux",
                "Sc Mn",
                "Ps Ap",
                "Xi Oh",
                "Ms Oh",
                "Ps Eo",
                "Bq Oh",
                "Mn Mv",
                "Bq Qp",
                "Eo Sc",
                "Uf Sg",
                "Gf Ux",
                "Qy Ly",
                "Oh Nl",
                "Mn Gf",
                "Kj Eo",
                "Kj Ly",
                "Yl Ps",
                "Xn Jz",
                "Qp Nc",
                "Mn Dn",
                "Ps Sc",
                "Au Qy",
                "Pl Gf",
                "Sg Sc",
                "Qy Xn",
                "Yl Nl"
                },
                17,
                new string[] {
                "Mn",
                "Ms",
                "Mv",
                "Eo",
                "Ap",
                "Xi",
                "Au",
                "Nc",
                "Pl",
                "Nl",
                "Lk",
                "Ps",
                "Jz",
                "Sc",
                "Uf",
                "Qp",
                "Kj"
            });
            n.Run();
        }

        private static Network FileToNetwork(String filePath) {
            string[] lines = System.IO.File.ReadAllLines(filePath);
            Network.Input input = new Network.Input();
            int i = 0;
            input.n = Int32.Parse(lines[i]);
            i++;
            input.names = new string[input.n];
            for (int init = i; i < input.n + init; i++) {
                input.names[i-init] = lines[i];
            }
            input.nRelations = Int32.Parse(lines[i]);
            i++;
            input.relations = new string[input.nRelations];
            for (int startCount = i;i< input.nRelations+startCount; i++) {
                input.relations[i-startCount] = lines[i];
            }
            input.nQueries = Int32.Parse(lines[i]);
            i++;
            input.queryNames = new string[input.nQueries];
            for (int init = i;  i < input.nQueries+init; i++) {
                input.queryNames[i - init] = lines[i];
            }
            Network n = new Network(input);
            return n;
        }
    }
}
