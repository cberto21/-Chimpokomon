class Ataque: 
    def get_danio() -> int:
        pass
    def get_recupera() -> int :
        pass
    def realizar_ataque(atacado,atacante):
        pass
    def tiene_efecto() -> bool:
        return False
    def tiene_ventaja(atacado, atacante):
        pass


class AtaqueConcret(Ataque):
    def __init__(self, nombre, danio, recupera, ventaja):
        self.nombre = nombre
        self.danio = danio
        self.recupera = recupera
        self.ventaja = ventaja
    def get_nombre(self):
        return self.nombre
    def get_danio(self):
        return self.danio
    def get_recupera(self):
        return self.recupera
    def get_ventaja(self):
        return self.ventaja

    def realizar_ataque(self ,atacado ,atacante):
        if self.tiene_ventaja(atacado,atacante):
            atacado.modificar_vida( - self.danio - self.get_ventaja())        
        else:
            atacado.modificar_vida( - self.danio )
    
    def tiene_ventaja(self ,atacado ,atacante): 
        return atacante.get_naturaleza().get_ventaja() == atacado.get_naturaleza()
    

    def tiene_efecto():
        return False