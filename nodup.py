lst = list(input().split())

check = True
i=0;
while(i<len(lst)):
  j=i+1
  while(j<len(lst)):
    if(lst[i] == lst[j] and check):
      print("no")
      check = False
      break
    j=j+1
  i=i+1
if check:
  print("yes")