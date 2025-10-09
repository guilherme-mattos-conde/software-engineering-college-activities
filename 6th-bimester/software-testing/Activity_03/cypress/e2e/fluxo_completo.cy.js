describe('Fluxo completocom timer de 3s por tela', () => {
  beforeEach(() => {
    cy.visit('https://www.saucedemo.com/');
    cy.wait(3000);
  });
  it('Deve fazer login com sucesso', () => {
    cy.get('#user-name').type('standard_user');
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();
    cy.url().should('include', '/inventory.html');
    cy.wait(3000);
});
  it('Deve adicionar um item ao carrinho', () => {
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    cy.get('.shopping_cart_link').click();
    cy.url().should('include', '/cart.html');
    cy.get('.cart_item').should('have.length', 1);
  });

  it('Deve remover um item do carrinho', () => {
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    cy.get('.shopping_cart_link').click();
    cy.get('.cart_item').should('have.length', 1);
    cy.get('.cart_item').first().find('.btn_secondary').click();
    cy.get('.cart_item').should('have.length', 0);
  });

  it('Deve finalizar a compra com sucesso', () => {
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    cy.get('.shopping_cart_link').click();
    cy.get('#checkout').click();
    cy.get('#first-name').type('John');
    cy.get('#last-name').type('Doe');
    cy.get('#postal-code').type('12345');
    cy.get('#continue').click();
    cy.get('#finish').click();
    cy.url().should('include', '/checkout-complete.html');
  });
});