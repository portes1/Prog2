import pygame


class Bomber(pygame.sprite.Sprite):
    def __init__(self, x, y):
        super().__init__()
        self.image = pygame.image.load("bomber.jpg")
        self.rect = self.image.get_rect()
        self.rect.x = x
        self.rect.y = y

    def mover(self, x, y):
        self.rect.x = x
        self.rect.y = y


class Bomba(pygame.sprite.Sprite):
    def __init__(self, x, y):
        super().__init__()
        self.bombanormal = pygame.image.load("bomba.png")
        self.bombaexplodida = pygame.image.load("explosao.jpg")
        self.image = self.bombanormal
        self.rect = self.image.get_rect()
        self.rect.x = x
        self.rect.y = y


    def explode(self):

        self.image = self.bombaexplodida


class Manga(pygame.sprite.Sprite):
    def __init__(self, x, y):
        super().__init__()
        self.image = pygame.image.load("manga.png")
        self.rect = self.image.get_rect()
        self.rect.x = x
        self.rect.y = y

class Bloco(pygame.sprite.Sprite):
    def __init__(self,x,y):
            super().__init__()
            self.image = pygame.image.load("bloco.jpg")
            self.rect = self.image.get_rect()
            self.rect.x = x
            self.rect.y = y

