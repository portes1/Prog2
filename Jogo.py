import pygame, random, time
from Bomber import Bomber, Bomba, Manga, Bloco

PRETO = (0, 0, 0)

pygame.init()
LARGURA = 1600
ALTURA = 900
relogio1 = 20
relogio2 = 10
tela = pygame.display.set_mode([LARGURA, ALTURA])

mouse = pygame.mouse
mouse.set_visible(False)

todosObjetos = pygame.sprite.Group()


#x = random.randrange(LARGURA)
#y = random.randrange(ALTURA)
bomber = Bomber(20, 20)
todosObjetos.add(bomber)

#x = random.randrange(LARGURA)
#y = random.randrange(ALTURA)
manga = Manga(1500, 800)
todosObjetos.add(manga)


for i in range(290):
    x = random.randrange(200, 1200)
    y = random.randrange(ALTURA)
    bloco = Bloco(x, y)
    todosObjetos.add(bloco)

#pygame.sprite.spritecollide(bomber, bloco, True)













while True:
    filaEventos = pygame.event.get()

    for evento in filaEventos:
        if evento.type == pygame.QUIT:
            pygame.quit()
            exit()
        if evento.type == pygame.KEYDOWN:
            tecla = pygame.key.get_pressed()
            if tecla[pygame.K_DOWN]:
                bomber.rect.y += 20
            if tecla[pygame.K_UP]:
                bomber.rect.y -= 20
            if tecla[pygame.K_RIGHT]:
                bomber.rect.x += 20
            if tecla[pygame.K_LEFT]:
                bomber.rect.x -= 20
            if tecla[pygame.K_SPACE]:
                bomba = Bomba(bomber.rect.x, bomber.rect.y)
                todosObjetos.add(bomba)
                time.clock()

   # relogiocont = relogio1 - time.clock() * 10
   # if relogiocont < 0:
   #     bomba.explode()

   # relogiocont = relogio2 - time.clock() * 10
   # if relogiocont < 0:
   #     todosObjetos.remove(bomba)




    tela.fill(PRETO)
    todosObjetos.draw(tela)
    pygame.display.update()
