from Estados import Estados


class Info(Estados):    
    def debug(self, string):
        return

    def info(self, string):
        print(string)

    def warn(self, string):
        print(string)
        
    def error(self, string):
        print(string)