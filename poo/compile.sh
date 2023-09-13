PURPLE='\033[0;35m'
NC='\033[0m'

if [$# -ne 1]
then
    echo "usage: $0 classes"
    exit 1
fi

echo "\n${PURPLE}===== Compilation =====${NC}\n"

for class in $*
do
    javac $class.java
done

read -p "Exécuter fichier principal ? [o/n] " input
until [ $input = o ] || [ $input = n ]
do
   read -p "Exécuter fichier principal ?  [o/n] " input
done

if [ $input = o ]
then
    read -p "Main Class : " input
    echo "\n${PURPLE}============== Exécution =============${NC}\n"
    java $input
else
    echo "\n${PURPLE}======================================${NC}\n"
    exit 0
fi


read -p "Envoyer sur le dépôt distant ? [o/n] " input
until [ $input = o ] || [ $input = n ]
do
   read -p "Envoyer sur le dépôt distant ? [o/n] " input
done


if [ $input = o ]
then
    echo "\n${PURPLE}================ Envoi ===============${NC}\n"
    for class in $*
    do
        git add $class.java $class.class
    done

    read -p "Message du Commit : " input

    git commit -m "$input"
    git push
else
    echo "\n${PURPLE}======================================${NC}\n"
    exit 0
fi