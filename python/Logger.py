def singleton(cls):

    instances = dict()

    def decorar(*args, **kwargs):
        if cls not in instances:
            instances[cls] = cls(*args, **kwargs)
        
        return instances[cls]

    return decorar

@singleton
class Logger(object):

    def __init__(self, estado):
        self.__estado = estado
   
    def set_nivel(self, estado):
        self.__estado = estado

    def get(self):
        return self.__estado
    
    def debug(self, string):
        self.__estado.debug(string)
    
    def info(self, string):
        self.__estado.info(string)
    
    def warn(self, string):
        self.__estado.warn(string)
    
    def error(self, string):
        self.__estado.error(string)