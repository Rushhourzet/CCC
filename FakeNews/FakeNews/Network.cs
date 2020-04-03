using System;
using System.Collections.Generic;
using System.Text;

namespace FakeNews {
    class Network {
        public Input input;
        public Output output;

        public Network(int nQueries) {
            output.nOfFollowers = new int[nQueries];
        }
        public Network(Input input) {
            this.input = input;
            output.nOfFollowers = new int[input.nQueries];
        }

        public void Run() {
            ProcessOutput();
            PrintOutput();
        }
        private void PrintOutput() {
            for (int i = 0; i < output.names.Length; i++) {
                Console.WriteLine(output.names[i] + " " + output.nOfFollowers[i]);
            }
        }
        private void ProcessOutput() {
            output.names = input.queryNames;
            /*
            for (int i = 0; i < input.n; i++) {
                for (int j = 0; j < input.nRelations; j++) {
                    if(input.relations[j].Contains(input.names[i] + " ")) {
                        output.nOfFollowers[i]++;
                    }
                }
            }*/
            for (int i = 0; i < input.nQueries; i++) {
                for (int j = 0; j < input.nRelations; j++) {
                    if (input.relations[j].Contains(input.queryNames[i] + " ")) {
                        output.nOfFollowers[i]++;
                    }
                }
            }
        }


        public struct Input {
            public int n;
            public string[] names;
            public int nRelations;
            public string[] relations;
            public int nQueries;
            public string[] queryNames;

            public Input(int n, string[] names, int nRelations, string[] relations, int nQueries, string[] queryNames) {
                this.n = n;
                this.names = names;
                this.nRelations = nRelations;
                this.relations = relations;
                this.nQueries = nQueries;
                this.queryNames = queryNames;
            }
        }

        public struct Output {
            public string[] names;
            public int[] nOfFollowers;
        }

    }
}
