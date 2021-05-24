import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCompra extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 25%; justify-content: center;">
  <label id="fechaPedidoLbl" style="width: 80%; align-self: flex-start;"></label>
  <label id="idLBL" style="width: 80%; align-self: flex-start;"></label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 15%; justify-content: center;">
  <label style="width: 80%; align-self: center;">Estado:</label>
  <label id="estadoLbl" style="width: 80%; align-self: center;"></label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 20%; justify-content: center;">
  <vaadin-button id="cancelarPedidoBtn" style="width: 80%; align-self: center;">
    Cancelar pedido 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 20%; justify-content: center;">
  <vaadin-button id="verProductosBtn" style="width: 80%;">
    Ver productos 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 20%; justify-content: center;">
  <label id="precioLbl" style="width: 80%; align-self: center;"></label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-compra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCompra.is, VistaCompra);
