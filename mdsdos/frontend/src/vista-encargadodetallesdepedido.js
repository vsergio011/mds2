import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEncargadodetallesdepedido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%

                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-xl);">
  <label style="font-weight:bold;">Detalles Del pedido</label>
  <label id="identificadorLbl">id: 1212323142134</label>
  <vaadin-vertical-layout theme="spacing" style="width: 80%;">
   <label style="width: 100%;">Comprador</label>
   <label id="lbDatosComprador" style="width: 100%; flex-grow: 1; margin: var(--lumo-space-m);"> Nombre y apellidos</label>
   <label style="width: 100%;">Direccion</label>
   <label id="lbDireccionComprador" style="width: 100%; flex-grow: 1; margin: var(--lumo-space-m);">Direccion del comprador</label>
   <label style="width: 100%;">Fecha de pedido</label>
   <label id="lbFechaPedido" style="width: 100%; flex-grow: 1; margin: var(--lumo-space-m);">Fecha de pedido</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-checkbox id="checkEnviado">
     Enviado 
   </vaadin-checkbox>
   <vaadin-checkbox id="checkRecibido">
     Recibido 
   </vaadin-checkbox>
  </vaadin-horizontal-layout>
  <vaadin-button id="aprobarBtn" style="align-self: center;"></vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-xl);">
  <vaadin-text-field label="Total" value="1000" id="textTotal" style="align-self: flex-end;" has-value>
   <div slot="prefix">
     $ 
   </div>
  </vaadin-text-field>
  <vaadin-vertical-layout id="contenedorProductos" style="width: 100%; height: 80%; border:solid; align-items: center; justify-content: flex-start;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-encargadodetallesdepedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargadodetallesdepedido.is, VistaEncargadodetallesdepedido);
