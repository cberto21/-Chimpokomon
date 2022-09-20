from Estados import Estados


class Error(Estados):    
    def debug(self, string):
        return

    def info(self, string):
        return

    def warn(self, string):
        return
        
    def error(self, string):
        print(string)