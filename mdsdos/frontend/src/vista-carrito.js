import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout style="height: 20%; width: 100%; justify-content: space-between;">
  <vaadin-vertical-layout theme="spacing-l" style="justify-content: flex-start; padding: var(--lumo-space-l);">
   <label style="font-weight: bold; align-self: flex-start; flex-grow: 0;">Carrito de la compra </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="margin: var(--lumo-space-l);">
   <vaadin-button id="registerBtn" style="align-self: flex-end;">
     Registrarse 
   </vaadin-button>
   <vaadin-button id="comprarBtn" style="align-self: flex-end;">
     Comprar 
   </vaadin-button>
   <label style="align-self: flex-end;" id="priceLbl">aaaa </label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout id="productosLayout" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-carrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCarrito.is, VistaCarrito);