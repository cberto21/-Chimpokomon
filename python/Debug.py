from Estados import Estados


class Debug(Estados):
    
    def debug(self, string):
        print(string)
    
    def info(self, string):
        print(string)
    
    def warn(self, string):
        print(string)
    
    def error(self, string):
        print(string)