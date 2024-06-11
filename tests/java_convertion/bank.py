
accounts_list = []

def register(first_name,last_name, pin,balance= 0.0):
    #first_name = Str(input("Enter your First Name: "))
    #last_name = Str(input("Enter Your Last Name: "))
   # pin = int(input("Enter your pin: "))
    print("Account opened Successfully")
    new_account = [first_name, last_name,pin,balance]
    accounts_list.append(new_account)
    #accounts.append([account_number, first_name, last_name, pin, balance

