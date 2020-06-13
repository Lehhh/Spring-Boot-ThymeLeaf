#######################################################################
## Informações do desenvolvedor:                                     ##
## Dev: Leandro Shiniti Tacara                                       ##
## Email: leandro.tacara@hotmail.com                                 ##
## Github: https://github.com/Lehhh                                  ##
## Linkedin: https://www.linkedin.com/in/leandro-shiniti-tacara/     ##
## Data: 12/06/2020 19:18                                            ##
## projeto: Curso                                                    ##
#######################################################################


Comandos Docker

Necessário rodar um container postgres 

docker run -d \
    --name postgres \
    -e POSTGRES_PASSWORD=root \
    -e PGDATA=/var/lib/postgresql/data/pgdata \
    -v {LOCAL_DO_VOLUME_POSTGRES}:/var/lib/postgresql/data \
    postgres