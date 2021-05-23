import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import './vista-productopedido.js';

class VistaDetallecompra extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 90%; padding: var(--lumo-space-m); align-self: center;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <label style="font-weight: bold; flex-grow: 0;">Fecha de Pedido</label>
   <label id="idPedido" style="flex-grow: 0;">ID:</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="justify-content: space-between; flex-grow: 0; width: 90%;">
   <vaadin-button>
    Cancelar compra
   </vaadin-button>
   <vaadin-text-field value="1000" id="total" has-value>
    <div slot="prefix">
      $ 
    </div>
   </vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 80%; align-self: center;">
  <vista-productopedido></vista-productopedido>
  <vista-productopedido></vista-productopedido>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-detallecompra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDetallecompra.is, VistaDetallecompra);
