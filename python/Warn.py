from Estados import Estados


class Warn(Estados):
    
    def debug(self, string):
        return

    def info(self, string):
        return

    def warn(self, string):
        print(string)
        
    def error(self, string):
        print(string)