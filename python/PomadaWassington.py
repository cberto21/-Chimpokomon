from DecoratorAtaques import DecoratorAtaques

class PomadaWassington(DecoratorAtaques):
    def __init__(self, aDecorar):
        super().__init__(aDecorar)
    
    def realizar_ataque(self, atacado, atacante) :
        total = self.get_recupera()
        if self.tiene_ventaja(atacado,atacante):
            total += self.get_ventaja()
            atacante.modificar_vida( total )            
        else:
            atacante.modificar_vida( total )
        atacado.set_recuperacion_recibido( total )