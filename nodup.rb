n=gets.chomp.split.map(&:to_s)

check = true
i=0;
while(i<n.length)
  j=i+1
  while(j<n.length)
    if(n[i] == n[j] and check)
      print "no"
      check = false
      break
    end
    j=j+1
  end
  i=i+1
end
if check
  print "yes"
end
