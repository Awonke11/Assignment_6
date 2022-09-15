# Author : Awonke Mnotoza

integer_input = input("Enter an integer (or 'END'): \n")
integer_list = []
counter = 0

if integer_input == "END":
    print(f"Number of pairs of adjacent numbers where 1st is divisable 2nd: {counter}")
else:
    integer_list.append(int(integer_input))
    while True:
        integer_input = input("Enter an integer (or 'END'): \n")
        if integer_input == "END":
            break
        integer_list.append(int(integer_input))
        
for i in range(len(integer_list) - 1):
    if integer_list[i] % integer_list[i+1] == 0:
        counter = counter + 1
        
print(f"Number of pairs of adjacent numbers where 1st is divisable 2nd: {counter}")