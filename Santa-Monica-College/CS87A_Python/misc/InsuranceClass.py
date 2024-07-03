def main():
  ins_pol1=InsurancePolicy('A005PXY2')
  ins_pol1.payPremium(500)
  amount_due=ins_pol1.get_duePayment()
  print(amount_due)

class InsurancePolicy:
  def __init__(self, policyNo):
    self.__No=policyNo

  def getNo(self):
    return self.__No

  def payPremium(self, amount):
    self.__duePayment = amount

  def get_duePayment(self):
    return self.__duePayment

main()
