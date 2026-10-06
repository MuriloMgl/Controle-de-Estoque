produtos = []
qtdProdutos = [ ]
precos = []

opcao = 0

while opcao != 5:
    print("--------Estoque------------\n")
    print("1 | Listar produtos")
    print("2 | Cadastrar produtos")
    print("3 | Repor produto")
    print("4 | Retirar produto")
    print("5 | Sair")
    
    try:
        opcao = int(input("Escolha uma das opções: "))
    except ValueError:
        print("\n Digite uma opção válida.\n")
        continue
    
    match opcao:

        case 1:
            print("\n---------PRODUTOS----------\n")
            if len(produtos) == 0:
                print("Não há nenhum produto cadastrado")

            else:
                for i in range(len(produtos)):
                    print(
                        f"{i + 1} - Produto: {produtos[i]} | "
                        f"Quantidade: {qtdProdutos[i]} | "
                        f"Preço: R$ {precos[i]} | \n "
                    )
        case 2:
            print("\n---------CADASTRAR PRODUTO----------\n")
             
            nome = input("Digite o nome do produto: ").strip()
            if nome.strip() == "": #não aceita campos vazios
                print("O nome do produto não pode ficar vazio.")
                continue
            if nome in produtos:
                print("Esse produto já está cadastrado.")
                continue  
             
            try:
                quantidade = int(input("Digite a quantidade: "))
                preco = float(input("Informe o valor: "))
            except ValueError:
                print("Digite uma quantidade válida.")
                continue
            
            if quantidade <= 0 or preco <= 0:
                print("Digite um valor váildo")
                continue
            
        
                       
            produtos.append(nome)
            qtdProdutos.append(quantidade)
            precos.append(preco)
            
            
            print("Produto cadastrado!")
            
        case 3:
            print("\n---------REPOR PRODUTO----------\n")
            
            if len(produtos) == 0:
                print("Não há produtos cadastrados.")
                continue
            
            for i in range(len(produtos)):
                print(f"{i + 1} - {produtos[i]} | Quantidade: {qtdProdutos[i]}")
            
            try:
                produto = int(input("Digite o número do produto: "))
            except ValueError:
                print("Digite um valor válido.")
                continue
    
            if produto < 1 or produto > len(produtos):
                print("Número inválido.")
                continue
            
            indice = produto - 1
            
            try:
                quantidade = int(input("Informe a quantidade que deseja repor: "))
            except ValueError:
                print("Digite um valor válido.")
                continue
            
            if quantidade <= 0:
                print("A quantidade deve ser superior a zero")
                continue
            
            qtdProdutos[indice] += quantidade
            print("Produto reposto.")
            
        case 4:
            print("\n---------RETIRAR PRODUTO----------\n")
                        
            if len(produtos) == 0:
                print("Não há produtos cadastrados.")
                continue
                        
            for i in range(len(produtos)):
                print(f"{i + 1} - {produtos[i]} | Quantidade: {qtdProdutos[i]}")
                        
            try:
                produto = int(input("Digite o número do produto: "))
            except ValueError:
                print("Digite um valor válido.")
                continue
            
            if produto < 1 or produto > len(produtos):
                print("Número inválido.")
                continue
        
            
            indice = produto -1 
            
            try:
                quantidade = int(input("Informe a quantidade que deseja retirar: "))
            except ValueError:
                print("Digite um valor válido.")
                continue
            
            if quantidade <= 0:
                print("A quantidade deve ser superior a zero")
                continue
            
                
            if quantidade > qtdProdutos[indice]:
                print("Quantidade indisponível no estoque.")
                continue
            
            qtdProdutos[indice] -= quantidade
            print("Produto retirado.")
            
            
           
        
            
                    
                                
                    

  


